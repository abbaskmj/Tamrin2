package tamrin2_2;

public class Studentreg {


    public static void main(String[] args) {

        Student st1=new Student();
        st1.name="ali";
        st1.family="rezae";
        st1.age="23";

        City c1=new City();
        c1.cityname="tehran";
        c1.citycode="21";

        st1.cityfeu=c1;

        Student st2=new Student();
        st2.name="akbar";
        st2.family="mohammadi";
        st2.age="22";

        City c2=new City();
        c2.cityname="kish";
        c2.citycode="10";

        st2.cityfeu=c2;


        System.out.println(st1.name+" "+st1.family+" "+st1.age+" "+st1.cityfeu.cityname+" "+st1.cityfeu.citycode);
        System.out.println(st2.name+" "+st2.family+" "+st2.age+" "+st2.cityfeu.cityname+" "+st2.cityfeu.citycode);

    }



}
