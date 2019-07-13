package stack;
import  Entity.Person;

public class StackPushPop {
    Node last = null;

    /*
     * Insere no fim da pilha
     * Inserts at the end of the stack
     */
    public void push(Person person){
        Node newNode = new Node();
        if(last == null){
            newNode.person = person;
            last = newNode;
        }else{
            newNode.person = person;
            last.next = newNode;
            newNode.before = last;
            last = newNode;
        }
    }

    /*
     * Retira no fim da pilha
     * Pull out at the end of the stack
     */
    public Person pop(){
        Person person = new Person();
        if(last == null){
            System.out.println("empty stack");
        }else if(last.before != null){
            person = last.person;
            last.before.next = null;
            last = last.before;
        }else{
            person = last.person;
            last = null;
        }
        return person;
    }
}

/*
 * Aulas particulares de programação (online e presencial)
 * (85) 999273805
 * Instagram profissional: https://www.instagram.com/programador_who/
 */