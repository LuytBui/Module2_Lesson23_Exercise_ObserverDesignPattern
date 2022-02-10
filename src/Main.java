public class Main {

    public static void main(String[] args) {
	Subject subject = new Subject();
//    subject.setState(1);

    Observer hexObserver = new HexObserver(subject);
    Observer octObserver = new OctObserver(subject);
    Observer binObserver = new BinObserver(subject);

    subject.setState(66);


    }
}
