/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19.pkg3;

/**
 *
 * @author hp
 */
public class Lab193 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();  
        human.sleep();
        
        
         Monkey[] monkeys = new Monkey[2];
        monkeys[0] = new Monkey();
        monkeys[1] = new Human();

        for (Monkey monkey : monkeys) {
            monkey.jump();
            monkey.bite();

            if (monkey instanceof Human) {
                Human human = (Human) monkey;
                human.eat();
                human.sleep();
            }
        }
    }
    }
    

interface BasicAnimal {
    void eat();
    void sleep();
}

class Monkey {
    public void jump() {
        System.out.println("Monkey is jumping.");
    }

    public void bite() {
        System.out.println("Monkey is biting.");
    }
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}
