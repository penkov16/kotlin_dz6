
class AudioAttachment : Attachment{
    override val type: String = "Аудио"
    val audio: Audio = Audio()
}
class Audio(
    val id: Int? = null,
    val ownerId: Int? = null,
    val artist: String? = null,
    val title: String? = null
)

class PhotoAttachment : Attachment{
    override val type: String = "Фото"
    val photo: Photo = Photo()
}
class Photo(
    val id: Int? = null,
    val albumId: Int? = null,
    val ownerId: Int? = null,
    val userId: Int? = null
)
class VideoAttachment : Attachment{
    override val type: String = "Видео"
    val video: Video = Video()
}
class Video(
    val id: Int? = null,
    val ownerId: Int? = null,
    val title: String? = null,
    val description: String? = null
)
class DocAttachment : Attachment{
    override val type: String = "Документ"
    val doc: Doc = Doc()
}
class Doc(
    val id: Int? = null,
    val ownerId: Int? = null,
    val title: String? = null,
    val size: Int? = null
)
class LinkAttachment : Attachment{
    override val type: String = "Ссылка"
    val link: Link = Link()
}
class Link(
    val url: String? = null,
    val title: String? = null,
    val caption: String? = null,
    val description: String? = null
)


