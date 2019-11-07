package ru.job4j.shildt;

// Возврат объекта
class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

class RetOb {
    public static void main(String arghs[]){
    Test ob1 = new Test(2);
    Test ob2;
    ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);


    }

}
