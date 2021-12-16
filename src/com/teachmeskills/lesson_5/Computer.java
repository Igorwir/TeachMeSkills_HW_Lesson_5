package com.teachmeskills.lesson_5;

/**
 * In the computer class, we create fields, constructors and a method for displaying all parameters.
 */
public class Computer {
    int price;
    String model;
    int ram;
    int hdd;
    Computer(int p,String m){
        this.price = p;
        this.model = m;
    }
    Computer(int p,String m,int r,int h){
        this.price = p;
        this.model = m;
        this.ram = r;
        this.hdd = h;
    }
    void showInfo(){
        System.out.println("Price is: "+ price + ", Model is: " + model + ", RAM is: " + ram + ", HDD is: " + hdd);
    }

    /**
     *
     * We creat 2 objects
     */
    public static void main(String[] args) {
Computer comp1 = new Computer(500,"HP");
Computer comp2 = new Computer(800,"Samsung",4,500);
comp1.showInfo();
comp2.showInfo();

    }
}

/**
 * We creat class Ram with fields and constructors
 */
class Ram {
    String name = "DDR2";
    int volume = 4;

    Ram(String s, int v) {
        this.name = s;
        this.volume = v;
    }

    Ram() {
    }
    void info() {
        System.out.println("Name: " + name + "Volume: " + volume);
    }
}

/**
 * We creat class HDD with fields and constructors
 */
        class HDD {
            String name = "TOSHIBA";
            int volume = 500;
            String type = "SSD" ;

            HDD(String s, int v, String t) {
                this.name = s;
                this.volume = v;
                this.type = t;
            }
            HDD() {
            }
            void info() {
                System.out.println("Name: " + name + "Volume: " + volume + " Type: " + type);
            }
        }

