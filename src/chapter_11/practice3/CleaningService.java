package chapter_11.practice3;

//インターフェース
//条件：
//１，すべて抽象メゾットであること
//２、フィールドを持たない

//※すべて抽象メゾットであることから子クラスではメゾットを確定しなければならない

public interface CleaningService {
	Shirt washShirt(Shirt s); //抽象メゾット
	Towl washTowl(Towl t); //抽象メゾット
	Coat washCoat(Coat c); //抽象メゾット

}
