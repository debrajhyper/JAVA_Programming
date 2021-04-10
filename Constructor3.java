class Test{
    Test(int id, String name, double sal){
        
        if(name=="Null" || id==0 || sal==0){
            System.out.println("wrong data!");
        }
        else{
            System.out.printf("Id =%2d  ", id);
            System.out.printf("Name =%8s    ", name);
            System.out.printf("Salary =%10.3f   ", sal);            
        }
        System.out.println();
    }

    Test(int id, String name){
        System.out.println("fill all the required data !");
    }

    Test(int id, double sal){
        System.out.println("fill all the required data !");
    }

    Test(String name, double sal){
        System.out.println("fill all the required data !");
    }

    Test(int id){
        System.out.println("fill all the required data !");
    }

    Test(String name){
        System.out.println("fill all the required data !");
    }

    Test(double sal){
        System.out.println("fill all the required data !");
    }
}

public class Constructor3{
    public static void main(String[] args){
        Test obj1 = new Test(1,"debraj",5246.2);
        Test obj2 = new Test(2,"lol",4526.2);
        Test obj3 = new Test(3,"yahoo",5586.2);
        Test obj4 = new Test(4,"debraj");
        Test obj5 = new Test(5,4526.2);
        Test obj6 = new Test("yahoo");
        Test obj7 = new Test(7,"Null",5756.2);
        Test obj8 = new Test(8);
        Test obj9 = new Test(0,"google",0);
    }
}