package org.example.test;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {
    /*
    测试jpa的保存
        案例：保存一个客户到数据库中
    Jpa的操作步骤
        1。加载配置文件创建工厂（实体管理器工厂）对象
        2。通过实体类管理类工厂获取实体管理器
        3。获取事务对象开启事务
        4。完成增删查改
        5。提交事务
        6。释放资源
     */
    @Test
    public void testSave(){
        //1。加载配置文件创建工厂（实体管理器工厂）对象
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        //2。通过实体管理器工厂获取实体管理器
        EntityManager em = factory.createEntityManager();
        //3。获取事务对象，开启事务
        EntityTransaction transaction = em.getTransaction();//获取事务对象
    }
}
