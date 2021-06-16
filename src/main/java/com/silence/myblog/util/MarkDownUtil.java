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
 * @Description : markdown转html
 */
public class MarkDownUtil {
    /**
     * 将md格式转换为html格式
     * @param markdownString
     * @return html格式"字符串"
     */
    public static String mdToHtml(String markdownString) {
        if (StringUtils.isEmpty(markdownString)) {
            return "";
        }
        List<Extension> extensions = Arrays.asList(TablesExtension.create());
        Parser parser = Parser.builder().extensions(extensions).build();
        Node document = parser.parse(markdownString);
        HtmlRenderer renderer = HtmlRenderer.builder().extensions(extensions).build();
        String content = renderer.render(document);
        return content;
    }
}
