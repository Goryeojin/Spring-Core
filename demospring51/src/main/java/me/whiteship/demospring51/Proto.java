package me.whiteship.demospring51;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//@Component @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
// SingleTone Bean 이 Proto type Bean 을 참조하게 되면 Proto type Bean 이 업데이트가 되지 않는다. 업데이트하기 위한 방법으로 @Scope (proxyMode= 를 설정하면 된다.
@Component @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {
}
