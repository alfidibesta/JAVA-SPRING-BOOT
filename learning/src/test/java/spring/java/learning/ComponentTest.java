package spring.java.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.java.learning.repository.CategoryRepository;
import spring.java.learning.repository.CustomerRepository;
import spring.java.learning.repository.ProductRepository;
import spring.java.learning.service.CategoryService;
import spring.java.learning.service.CustomerService;
import spring.java.learning.service.ProductService;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testService() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testContructorDependencyInjection() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productService.getProductRepository(), productRepository);
    }

    @Test
    void tesSetterDependencyInjection() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    void testFieldDependencyInjection() {

        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository customerRepository = applicationContext.getBean(CustomerRepository.class);

        Assertions.assertSame(customerService.getCustomerRepository(), customerRepository);
    }

    @Test
    void testQualifier() {

        CustomerService customerService = applicationContext.getBean(CustomerService.class);

        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository",
                CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository",
                CustomerRepository.class);

        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }
}
