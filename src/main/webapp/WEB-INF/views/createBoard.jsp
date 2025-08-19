<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판 작성</title>
</head>
<body>
    <h1>게시판 작성</h1>
    <!-- 게시글 작성 -->
    <form id="createForm" method="post" action="<c:url value='/board/createBoard'/>">
        <div>
            <label>제목</label>
            <input type="text" name="title" id="title" required>
        </div>
        <div>
            <label>내용</label>
            <textarea name="content" id="content" rows="5" cols="40" required></textarea>
        </div>
        <div>
            <label>작성자</label>
            <input type="text" name="writer" id="writer" required>
        </div>
        <button type="button" id="btn">작성하기</button>
    </form>
    <a href="/board">뒤로</a>

    <!-- js -->
    <script>
        document.getElementById("btn").addEventListener("click", function() {
            const title = document.getElementById("title").value.trim();
            const content = document.getElementById("content").value.trim();
            const writer = document.getElementById("writer").value.trim();

            if (title === "") {
                alert("제목은 필수입니다.");
                return;
            }
            if (content === "") {
                alert("내용은 필수입니다.");
                return;
            }
            if (writer === "") {
                alert("작성자는 필수입니다.");
                return;
            }

            document.getElementById("createForm").submit();
        });
    </script>
</body>
</html>