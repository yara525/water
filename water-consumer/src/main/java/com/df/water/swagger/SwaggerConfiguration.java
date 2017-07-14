package com.df.water.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2 supporting Restful API document.
 * <p/>
 * swagger2 接口可视化,用于生产-显示-测试RESTful服务
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */

@Configuration   // 自动加载环境变量
@EnableSwagger2
public class SwaggerConfiguration {

    /**
     * swagger2 config docket (api文档摘要信息)
     *
     * @return docket
     */
    @Bean
    public Docket createRestfulApiDocumentDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.getSwaggerApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.df.water.web"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * swagger2 api basic information
     *
     * @return api info
     */
    private ApiInfo getSwaggerApiInfo() {
        return new ApiInfoBuilder()
                .title("正蓝节能接口文档")
                .version("1.0.0")
                .description("正蓝节能-项目改造-需求修改-api文档")
                .termsOfServiceUrl("http://www.difengshanguo.com/")
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }
}
