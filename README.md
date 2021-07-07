# MyBlog
> a blog website developed by springboot+mybatis+thymeleaf

## how to make it work?

> just run it as a sprintboot project in IDEAL

```xml
    <select id="findCategoryList" parameterType="Map" resultMap="BaseResultMap">
        select
        <include refid="Base_Column_List"/>
        from tb_blog_category
        where is_deleted=0
        order by category_rank desc,create_time desc
        <if test="start!=null and limit!=null">
            limit #{start},#{limit}
        </if>
    </select>
```
如果参数是map的话也可以直接用#从map中取数据
```xml
    <select id="selectByCategoryIds" resultMap="BaseResultMap">
        select
        <include refid="Base_Column_List"/>
        from tb_blog_category
        where category_id IN
        <foreach collection="categoryIds" item="item" index="index"
                 open="(" separator="," close=")">#{item}
        </foreach>
        AND is_deleted = 0
    </select>

```
如果查找参数是一个数组，可以用in+foreach
- 个人感觉mapper.xml中如果参数是对象的话不需要写parameterType这个属性了

th:fragment