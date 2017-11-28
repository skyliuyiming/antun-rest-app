package org.liuyiming.bigdata.antun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.liuyiming.bigdata.antun.domain.Channel;
import org.liuyiming.bigdata.antun.domain.ChannelExample;
import org.liuyiming.bigdata.antun.domain.ChannelExample.Criteria;
import org.liuyiming.bigdata.antun.mapper.ChannelMapper;

/**
 * 渠道业务类
 * @author zdjy
 *
 */
@Service
public class ChannelServiceImpl implements ChannelService {
	@Autowired
	private ChannelMapper channelMapper;

	@Override
	public Channel findByChannelCode(String channelCode) {
		ChannelExample channelExample = new ChannelExample();
		Criteria createCriteria = channelExample.createCriteria();
		createCriteria.andCodeEqualTo(channelCode);
		List<Channel> selectByExample = channelMapper.selectByExample(channelExample);
		if(selectByExample.isEmpty())
			return null;
		return selectByExample.get(0);
	}
}
