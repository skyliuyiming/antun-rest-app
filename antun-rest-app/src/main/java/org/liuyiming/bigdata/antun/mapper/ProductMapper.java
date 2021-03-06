package org.liuyiming.bigdata.antun.mapper;

import org.liuyiming.bigdata.antun.domain.Product;
import org.liuyiming.bigdata.antun.domain.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {

	long countByExample(ProductExample example);

	int deleteByExample(ProductExample example);

	int deleteByPrimaryKey(Long id);

	int insert(Product record);

	int insertSelective(Product record);

	List<Product> selectByExample(ProductExample example);

	Product selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

	int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

	int updateByPrimaryKeySelective(Product record);

	int updateByPrimaryKey(Product record);
}