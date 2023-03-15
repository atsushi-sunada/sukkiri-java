package chapter_11.practice3;

//インターフェース
//条件：
//１，すべて抽象メゾットであること
//２、フィールドを持たない

//※すべて抽象メゾットであることから子クラスではメゾットを確定しなければならない

public interface CleaningService {
	Shirt washShirt(Shirt s);
	Towl washTowl(Tolw t);
	Coat washCoat(Coat c);

}
