public class Encapsulation {

        private String name;
        private int age;
        private int roll_no;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }


        public void setAge(int age) {
            this.age = age;
        }

        public int getRollNo() {
            return roll_no;
        }

        public void setRollNo(int roll_no) {
            this.roll_no = roll_no;
        }



        public static void main(String[] args) {

            Encapsulation s = new Encapsulation();

            s.setName("sumanth");
            s.setAge(23);
            s.setRollNo(469);


            System.out.println("Student Name: " + s.getName());
            System.out.println("Student Age: " + s.getAge());
            System.out.println("Student Roll No: " + s.getRollNo());
        }
    }

