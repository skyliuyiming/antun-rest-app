package org.liuyiming.bigdata.antun.service;

import org.liuyiming.bigdata.antun.domain.Product;

public interface ProductService {

	Product findByChannelCode(String productCode);

}
