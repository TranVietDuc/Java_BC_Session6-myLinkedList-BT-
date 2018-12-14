public class Test {
    public static void main(String[] args) {
        MyLinkedList TemplateLinkedList = new MyLinkedList("Cháu");
        TemplateLinkedList.addFirst("Hello");
        TemplateLinkedList.add(3,"Đức");
        TemplateLinkedList.printLinkedList();
        TemplateLinkedList.addLast("Hâm");
        TemplateLinkedList.printLinkedList();
        TemplateLinkedList.add(1,"Hi");
        TemplateLinkedList.printLinkedList();
        TemplateLinkedList.remove(3);
        TemplateLinkedList.printLinkedList();

        //Test contain
        System.out.println(TemplateLinkedList.contains("D"));
        System.out.println(TemplateLinkedList.contains("Hâm"));

        //Test indexOF
        System.out.println(TemplateLinkedList.indexOf("Đức"));
        System.out.println(TemplateLinkedList.indexOf("Hello"));

        //Testsize
        System.out.println(TemplateLinkedList.size());

        //Testget,getFirst,getLast
        System.out.println(TemplateLinkedList.getFirst());
        System.out.println(TemplateLinkedList.get(2));
        System.out.println(TemplateLinkedList.getLast());

        //Clear
        TemplateLinkedList.clear();
        TemplateLinkedList.printLinkedList();
    }
    }

