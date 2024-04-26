package jebi.hendardi.Springwebmvc;

import jebi.hendardi.Springwebmvc.interceptor.SessionInterceptor;
import jebi.hendardi.Springwebmvc.resolver.PartnerArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import jebi.hendardi.Springwebmvc.interceptor.SessionInterceptor;
import jebi.hendardi.Springwebmvc.resolver.PartnerArgumentResolver;

import java.util.List;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Autowired
    private SessionInterceptor sessionInterceptor;

    @Autowired
    private PartnerArgumentResolver partnerArgumentResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(partnerArgumentResolver);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(sessionInterceptor).addPathPatterns("/user/*");
    }
}
