package net.sjl.learn.deepinshallowout.decorator;

/*
 * @Time:2018/7/18 下午10:11
 * @Auther:Shijielei
 * @Describe: 服饰
 */
public class Costume extends Person {
    
    protected Person Person;
    
    public Costume(Person person) {
        this.Person = person;
    }

    @Override
    public void show() {
        if (this.Person != null) {
            this.Person.show();
        }
    }
}
