package java����;
import java.util.function.Consumer;

public class test {
	public static void ConsumerApple(Apple[] apps,Consumer<Apple> consumer){
		 for(Apple app:apps){
			 consumer.accept(app);
		 }
	 }
	public static void main(String[] args) {
		//ʹ��lambda���ʽ
		Apple []apples = {new Apple("red",0.3),new Apple("green",0.2)};
		ConsumerApple(apples, (apple)->System.out.println(apple));
		//ʹ���ڲ���
		ConsumerApple(apples, new Consumer<Apple>() {
			public void accept(Apple apple) {
				System.out.println(apple);
			}
		});
		
	}
	
}
