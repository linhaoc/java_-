package java特性;
import java.util.function.Consumer;

public class test {
	public static void ConsumerApple(Apple[] apps,Consumer<Apple> consumer){
		 for(Apple app:apps){
			 consumer.accept(app);
		 }
	 }
	public static void main(String[] args) {
		//使用lambda表达式
		Apple []apples = {new Apple("red",0.3),new Apple("green",0.2)};
		ConsumerApple(apples, (apple)->System.out.println(apple));
		//使用内部类
		ConsumerApple(apples, new Consumer<Apple>() {
			public void accept(Apple apple) {
				System.out.println(apple);
			}
		});
		
	}
	
}
