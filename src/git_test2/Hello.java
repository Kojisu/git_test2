package git_test2;

public class Hello {

    String message;

    public Hello() {
        this("안녕하세요");
    }

    public Hello(String message) {
        this.message = message;
    }

    public void say() {
        System.out.println(message);
    }

<<<<<<< HEAD
	public void say() {
		return message;
	}
=======
>>>>>>> afc3b61982d2805a0edfcfc35b23786f45eeb399
}
