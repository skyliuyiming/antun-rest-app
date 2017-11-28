package org.liuyiming.bigdata.antun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.liuyiming.bigdata.antun.domain.Product;
import org.liuyiming.bigdata.antun.domain.ProductExample;
import org.liuyiming.bigdata.antun.domain.ProductExample.Criteria;
import org.liuyiming.bigdata.antun.mapper.ProductMapper;

/**
 * 产品业务类
 * @author zdjy
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductMapper productMapper;

	@Override
	public Product findByChannelCode(String productCode) {
		ProductExample productExample = new ProductExample();
		Criteria createCriteria = productExample.createCriteria();
		createCriteria.andCodeEqualTo(productCode);
		List<Product> selectByExample = productMapper.selectByExample(productExample);
		if(selectByExample.isEmpty())
			return null;
		return selectByExample.get(0);
	}
}
