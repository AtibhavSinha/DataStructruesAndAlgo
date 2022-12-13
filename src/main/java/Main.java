import data.Node;
import stack.GenericStack;
import stack.StackUnderflowError;

public class Main {

    public static void main(String[] args) throws StackUnderflowError {

        Employee e1 = new Employee(1, "Atibhav");
        Employee e2 = new Employee(2, "Shristi");

        /*LinkedList newLL = new LinkedList<Employee>();
        newLL.addNode(e1);
        newLL.addNode(e2);
        System.out.println(newLL.countNodes());*/

        GenericStack employeeGenericStack = new GenericStack<Employee>();
        employeeGenericStack.push(e1);
        employeeGenericStack.push(e2);
        employeeGenericStack.pop();
        employeeGenericStack.print();

        /*MinStack minStack= new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(4);
        minStack.push(2);
        minStack.pop();
        System.out.println("Min element: " +minStack.minElement());
        */

        /*QueueUsingTwoStacks queueUsingTwoStacks = new QueueUsingTwoStacks();
        queueUsingTwoStacks.enqueue(1);
        queueUsingTwoStacks.enqueue(2);
        queueUsingTwoStacks.enqueue(3);
        queueUsingTwoStacks.enqueue(4);

        System.out.println("Dequeue Item = " + queueUsingTwoStacks.dequeue());
        System.out.println("Dequeue Item = " + queueUsingTwoStacks.dequeue());*/

    }

    public void printLinkedList(Node head){

    }

    static class Employee implements Comparable<Employee> {
        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Employee o) {
            if (this.id > o.id)
                return 1;
            return -1;
        }
    }


}
