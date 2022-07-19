import java.util.Objects

fun main() {
    val post = Post(ownerId = 2)
    println(post)
    println(Wallservise.add(post))

}

data class Post(
    val id: Int? = null,
    val ownerId: Int? = null,
    val fromId: Int? = null,
    val createdBy: Int? = null,
    val date: Int? = null,
    val text: String? = null,
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean? = null,
    val comments: Objects? = null,
    val copyright: Objects? = null,
    val likes: Objects? = null,
    val reposts: Objects? = null,
    val views: Objects? = null,
    val postType: String? = null,
    val post_source: Objects? = null,
    val attachment: Array<Attachment>? = null,
    val geo: Objects? = null,
    val signerId: Int? = null,
    val copy_history: Array<Post>? = null,
    val canPin: Boolean? = null,
    val canDelete: Boolean? = null,
    val canEdit: Boolean? = null,
    val isPinned: Boolean? = null,
    val markedAsAds: Boolean? = null,
    val isFavorite: Boolean? = null,
    val donut: Objects? = null,
    val postponedId: Int? = null
)
object Wallservise {
    private var posts = emptyArray<Post>()
    private var postid: Int = 1


    fun add(post: Post):Post{
        posts += post.copy(id = postid)
        postid++
        return posts.last()
    }
    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }
}

