public class RelyInversion {
        public static void main(String[] args) {
            Person person = new Person();
            person.receive(new Email());
            person.receive(new WeiXin());
        }
    }

    interface IReceiver{
        String getInfo();
    }

    class Email implements IReceiver{
        public String getInfo() {
            return "邮件回复";
        }
    }

    class WeiXin implements IReceiver{
        public String getInfo() {
            return "微信回复";
        }
    }

    class Person{
        public void receive(IReceiver receiver) {
            System.out.println(receiver.getInfo());
        }
    }

