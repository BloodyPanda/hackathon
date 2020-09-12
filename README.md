# Hackathon(hackathon of citi)
    1. 软件
        IDEA 安装 Lombok
        MySQL >=5.7 <8.0
        Maven >=3.5
        JDK 1.8
        
    2. 框架及版本
        <properties>
            <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
            <maven.compiler.source>1.8</maven.compiler.source>
            <maven.compiler.target>1.8</maven.compiler.target>
            <junit.version>4.12</junit.version>
            <log4j.version>1.2.17</log4j.version>
            <lombok.version>1.16.18</lombok.version>
            <mysql.version>5.1.47</mysql.version>
            <druid.version>1.1.16</druid.version>
            <mybatis.spring.boot.version>1.3.0</mybatis.spring.boot.version>
            <spring.boot.version>2.2.2.RELEASE</spring.boot.version>
            <spring.cloud.version>Hoxton.SR1</spring.cloud.version>
            <spring.cloud.alibaba.version>2.1.0.RELEASE</spring.cloud.alibaba.version>
        </properties>
        
    3. 微服务启动顺序(需要在maven的Tab框中，选中cloud-api-commons服务，然后执行install，安装此包到本地)
        1) eureka
        2) gateway
        3) 业务微服务(不需要启动 cloud-api-commons)
