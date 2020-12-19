package cn.asu;

import static cn.asu.util.IdcardUtils.*;

public class IdMain {

    public static void main(String[] args) {
        String idCard = "3689232519900576666";
        boolean b = validateCard(idCard);
        String province = getProvinceByIdCard(idCard);
        String city = getCitycodeByIdCard(idCard);
        int year = getYearByIdCard(idCard);
        int month = getMonthByIdCard(idCard);
        int date = getDateByIdCard(idCard);
        int age = getAgeByIdCard(idCard);
        String gender = getGenderByIdCard(idCard);
        System.out.println("身份证号：" + idCard);
        System.out.println("是否合法：" + b);
        System.out.println("省：" + province);
        System.out.println("城市编码：" + city);
        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + date);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
    }

}
