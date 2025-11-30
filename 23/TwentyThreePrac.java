public class TwentyThreePrac {
    static void task1(){
        ArrayQueueModule _ = new ArrayQueueModule();
        System.out.println(ArrayQueueModule.debugCapacity());
        {
            ArrayQueueModule.enqueue("Mila");
            ArrayQueueModule.enqueue("Milana");
            ArrayQueueModule.enqueue("Matv");
            ArrayQueueModule.enqueue("Checker");
            ArrayQueueModule.enqueue("Debug");
        }

        System.out.println(ArrayQueueModule.debugCapacity());

        while (ArrayQueueModule.size() != 0){
            System.out.println(ArrayQueueModule.dequeue());
        }
        System.out.println(ArrayQueueModule.size());
    }

    static void task2(){
        ArrayQueueADT<String> qu = new ArrayQueueADT<String>();
        System.out.println(ArrayQueueADT.isEmpty(qu));
        System.out.println(ArrayQueueADT.debugCapacity(qu));
        ArrayQueueADT.enqueue(qu, "Matvey");
        System.out.println(ArrayQueueADT.isEmpty(qu));
        System.out.println(ArrayQueueADT.size(qu));
        System.out.println(ArrayQueueADT.element(qu));
        {
            ArrayQueueADT.enqueue(qu, "Milana");
            ArrayQueueADT.enqueue(qu, "Milana");
            ArrayQueueADT.enqueue(qu, "Milana");
            ArrayQueueADT.enqueue(qu, "Mila");
        }
        System.out.println(ArrayQueueADT.size(qu));
        System.out.println(ArrayQueueADT.debugCapacity(qu));
    }

    static void task3(){
        ArrayQueue<Float> q = new ArrayQueue<Float>();
        System.out.println(q.debugCapacity());
        {
            q.enqueue(1f);
            q.enqueue(2f);
            q.enqueue(3f);
            q.enqueue(4f);
            q.enqueue(5f);
        }
        System.out.println(q.debugCapacity());
        {
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
        }
        System.out.println(q.size());
    }

    static void linkQue(){
        LinkedQue<String> group = new LinkedQue<String>();
        System.out.println(group.isEmpty());
        System.out.println(group.size());
        {
            group.enqueue("Mila");
            group.enqueue("Milana");
            group.enqueue("MilanaKazi");
        }
        System.out.println(group.size());
        
        while (!group.isEmpty()){
            System.out.println(group.dequeue());
        }
        System.out.println(group.size());
    }
    public static void main(String[] args) {
        linkQue();
    }
}