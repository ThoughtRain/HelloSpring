package com.prarui.service;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Mian {
    @Zhujie("你好啊")
    private static String x;

    public static void main(String s[]) {
//        ZhujieInt.inidata(Mian.class);
//        String webApp = BaseConfigUtils.getValue("web.app");
//        String welcome = BaseConfigUtils.getValue("web.welcome");
////        // 为 Student 添加字段
////        AddField add = new AddField(UersBean.class);
////        // 添加一个名为 address，类型为 java.lang.String 的 public 字段
////        add.addPublicField("address", "Ljava/lang/String;");
////        // 再增加一个名为 tel，类型为 int 的 public 方法
////        add.addPublicField("tel", "I");
////        // 重新生成 .class 文件
////        add.writeByteCode();
////        UersBean stu = new UersBean();
////        stu.setName("Tom");
////        String date = SQlUtils.insertDate("table_uers", "wanx", "1222", "xxx");
//        System.out.println(x);
//
//
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        Advice advice= (Advice) ctx.getBean("adviceImpl");
//        advice.firstMethed();;
//        advice.secondMethed();

        ChineseSpelling instance = ChineseSpelling.getInstance();
        instance.setResource("你好");
        String spelling = instance.getSpelling();
        System.out.println(spelling);
    }

}
