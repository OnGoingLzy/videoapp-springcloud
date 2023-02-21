package com.lzy;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author 22310
 * @version 1.0
 * @description TODO
 * @date 2023/2/21 13:56
 */
public class fastGeneration {
    // 基础信息配置
    /**
     * 数据库连接字符
     */
    private static final String URL = "jdbc:mysql://localhost:3306/projectpractice3";

    /**
     * 示例：private static final String PARENT_PACKAGE_NAME = "com.example.mybatisplusdemo";
     */
    private static final String PARENT_PACKAGE_NAME = "com.lzy";

    /**
     * 数据库用户名
     */
    private static final String USERNAME = "root";
    /**
     * 数据库密码
     */
    private static final String PASSWORD = "lzy3122588";
    /**
     * 项目根路径
     */
    private static final String PROJECT_ROOT_PATH = "F:/idea2022.1/code/test/generator";

    /**
     * 执行此处
     */
    public static void main(String[] args) {
        // 简单示例，适用于单模块项目
        simpleGenerator();
        // 完整示例，适用于多模块项目
//        completeGenerator();
    }

    /**
     * 【单模块】简单的实现方案
     */
    protected static void simpleGenerator() {

        // 包路径
        String packagePath = PROJECT_ROOT_PATH + "/src/main/java";
        // XML文件的路径
        String mapperXmlPath = PROJECT_ROOT_PATH + "/src/main/resources/mapper";

        // 开始执行代码生成
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                // 1. 全局配置
                .globalConfig(builder -> builder
                        // 作者名称
                        .author("lzy")
                        // 开启覆盖已生成的文件。注释掉则关闭覆盖。
                        .fileOverride()
                        // 禁止打开输出目录。注释掉则生成完毕后，自动打开生成的文件目录。
                        .disableOpenDir()
                        // 指定输出目录。如果指定，Windows生成至D盘根目录下，Linux or MAC 生成至 /tmp 目录下。
                        .outputDir(packagePath)
                        // 开启swagger2.注释掉则默认关闭。
                        // .enableSwagger()
                        // 指定时间策略。
                        .dateType(DateType.TIME_PACK)
                        // 注释时间策略。
                        .commentDate("yyyy-MM-dd")
                )

                // 2. 包配置
                .packageConfig((scanner, builder) -> builder
                        // 设置父表名
                        .parent(PARENT_PACKAGE_NAME)
                        //模块名
                        .moduleName(scanner.apply("generator"))
                        // mapper.xml 文件的路径。单模块下，其他文件路径默认即可。
                        .pathInfo(Collections.singletonMap(OutputFile.xml, mapperXmlPath))
                )

                // 3. 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？生成所有表，请输入[all]：")))
                        // 阶段1：Entity实体类策略配置
                        .entityBuilder()
                        // 开启生成实体时生成字段注解。
                        // 会在实体类的属性前，添加[@TableField("nickname")]
                        .enableTableFieldAnnotation()
                        // 逻辑删除字段名(数据库)。
                        .logicDeleteColumnName("is_delete")
                        // 逻辑删除属性名(实体)。
                        // 会在实体类的该字段属性前加注解[@TableLogic]
                        .logicDeletePropertyName("isDelete")
                        // 会在实体类的该字段上追加注解[@TableField(value = "create_time", fill = FieldFill.INSERT)]
                        .addTableFills(new Column("create_time", FieldFill.INSERT))
                        // 会在实体类的该字段上追加注解[@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)]
                        .addTableFills(new Column("update_time", FieldFill.INSERT_UPDATE))
                        // 阶段2：Mapper策略配置
                        .mapperBuilder()
                        // 开启 @Mapper 注解。
                        // 会在mapper接口上添加注解[@Mapper]
                        .enableMapperAnnotation()
                        // 启用 BaseResultMap 生成。
                        // 会在mapper.xml文件生成[通用查询映射结果]配置。
                        .enableBaseResultMap()
                        // 启用 BaseColumnList。
                        // 会在mapper.xml文件生成[通用查询结果列 ]配置
                        .enableBaseColumnList()
                        // 阶段4：Controller策略配置
                        //.controllerBuilder()
                        // 会在控制类中加[@RestController]注解。
                        //.enableRestStyle()
                        // 开启驼峰转连字符
                        //.enableHyphenStyle()
                        .build()
                )

                // 4. 模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                //.templateEngine(new BeetlTemplateEngine())
                .templateEngine(new FreemarkerTemplateEngine())

                // 5. 执行
                .execute();
    }
    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    private static String scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入" + "请输入模块名：" + "：");
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + "请输入模块名：" + "！");
    }

}
