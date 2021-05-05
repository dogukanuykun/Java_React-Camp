package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC
		ProductService productService = new ProductManager(new HibernateProductDao()
				,new JLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
	}

}
