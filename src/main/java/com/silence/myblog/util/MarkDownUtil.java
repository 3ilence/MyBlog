package com.silence.myblog.util;

import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName : MarkDownUtil
 * @Author : Silence
 * @Date: 2021/6/14 19:41
 * @Description : markdown格式转html格式的工具类
 */
public class MarkDownUtil {
    /**
     * 将md格式转换为html格式
     * @param markdownString
     * @return html格式"字符串"
     */
    public static String mdToHtml(String markdownString) {
        //如果待处理字符串内容为空，则直接返回即可
        if (StringUtils.isEmpty(markdownString)) {
            return "";
        }
        //关键类：Extension,Parser,Node,HtmlRenderer
        List<Extension> extensions = Arrays.asList(TablesExtension.create());
        Parser parser = Parser.builder().extensions(extensions).build();
        Node document = parser.parse(markdownString);
        HtmlRenderer renderer = HtmlRenderer.builder().extensions(extensions).build();
        String content = renderer.render(document);
        return content;
    }
}
