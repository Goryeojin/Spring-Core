package me.whiteship.demospring51;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

    @Autowired
    Proto proto;

//    @Autowired
//    private ObjectProvider<Proto> proto;
    // Object-Provider 를 사용하여 싱글톤 빈이 프로토타입 빈을 참조할 때 프로토타입 빈이 업데이트 되게 한다.



    public Proto getProto() {
        return proto;
//        return proto.getIfAvailable();
    }
}
