package test.mypac;
/*람다함수로 쓰일 인터페이스라고 명시해 놓는다.*/
//메인에서 람다식을 사용하므로 추상함수가 하나여야함...이에 따라 FunctionalInterface라고 Annotation을 해둠
@FunctionalInterface
public interface Calculator {
	public int calc(int num1, int num2);
}
