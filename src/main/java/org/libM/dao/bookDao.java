package org.libM.dao;

import org.apache.ibatis.annotations.Param;
import org.libM.entity.book;

import java.util.List;

public interface bookDao {

    /**
     *
     * @param bookIsbn
     * @param bookTitle
     * @param bookIntro
     * @param bookAuthor
     * @return
     */
    List<book> queryByParams(@Param("bookIsbn") String bookIsbn,
                             @Param("bookTitle") String bookTitle,
                             @Param("bookIntro") String bookIntro,
                             @Param("bookAuthor") String bookAuthor);



    /**
     * 查询列表
     * @param offset
     * @param num
     * @return
     */
    List<book> queryAll(@Param("offset") int offset,@Param("num") int num);

    /**
     * 添加图书项
     * @param bookIsbn
     * @param bookNumber
     * @param bookBorrow
     * @param bookImage
     * @param bookTitle
     * @param bookIntro
     * @param bookAuthor
     * @param authorIntro
     * @return
     */
    int addBook(@Param("bookIsbn") String bookIsbn,
                    @Param("bookNumber") int bookNumber,
                    @Param("bookBorrow") int bookBorrow,
                    @Param("bookImage") String bookImage,
                    @Param("bookTitle") String bookTitle,
                    @Param("bookIntro") String bookIntro,
                    @Param("bookAuthor") String bookAuthor,
                    @Param("authorIntro") String authorIntro);

    /**
     *
     * @param bookIsbn
     * @param bookNumber
     * @param bookBorrow
     * @param bookImage
     * @param bookTitle
     * @param bookIntro
     * @param bookAuthor
     * @param authorIntro
     * @return
     */
    int editBook(@Param("bookId") int bookId,
                     @Param("bookIsbn") String bookIsbn,
                     @Param("bookNumber") int bookNumber,
                     @Param("bookBorrow") int bookBorrow,
                     @Param("bookImage") String bookImage,
                     @Param("bookTitle") String bookTitle,
                     @Param("bookIntro") String bookIntro,
                     @Param("bookAuthor") String bookAuthor,
                     @Param("authorIntro") String authorIntro);

    /**
     * 获取图书图片路径
     * @param bookId
     * @return  ImageUrl
     */
    book getImage(int bookId);

    /**
     *
     * @param bookId
     * @return
     */
    int borrow(int bookId);

}
