package proxy_pattern.protection_proxy;

import java.lang.reflect.Proxy;

public class NonOwnerProxy {
    Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new NonOwnerInvocationHandler(person));
    }
}
