package proxy_pattern.protection_proxy;

import java.lang.reflect.Proxy;

public class OwnerProxy {
    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OwnerInvocationHandler(person));
    }
}
