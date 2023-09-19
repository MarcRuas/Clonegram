package com.marco.instagram_clone.data.repository

import com.marco.instagram_clone.data.model.Feed
import com.marco.instagram_clone.data.model.Story

val storyList: MutableList<Story> = mutableListOf(

    Story(
        userNickName = "guts",
        userAvatar = "https://pbs.twimg.com/media/FVtfdrEX0AEsdx3.jpg:large"
    ),

    Story(
        userNickName = "daryl",
        userAvatar = "https://i.pinimg.com/236x/e7/16/84/e71684c11b2bf7ae5ddfa7c75c736d09.jpg"
    ),

    Story(
        userNickName = "rick_grimes",
        userAvatar = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFapjLsFHrJlGpNMqbJ_hsYPj6mhOnTWGNqQ&usqp=CAU"
    ),

    Story(
        userNickName = "rick",
        userAvatar = "https://static.wikia.nocookie.net/twd/images/6/69/Rick_HQ.jpg/revision/latest?cb=20130914161138&path-prefix=pt-br"
    ),

    Story(
        userNickName = "lee_everest",
        userAvatar = "https://p2.trrsf.com.br/image/fget/cf/540/960/smart/images.terra.com/2023/08/02/415f8f88fc64f58eb12c079b008cb7a7-u8dj4w0xoj77.jpg"
    ),

    Story(
        userNickName = "clementine",
        userAvatar = "https://cdn.vox-cdn.com/thumbor/UqaKz5YnP3Ms6TCzrjzdFCNpjMI=/1400x1400/filters:format(png)/cdn.vox-cdn.com/uploads/chorus_asset/file/11724695/Screen_Shot_2018_07_21_at_2.10.22_PM.png"
    ),

    Story(
        userNickName = "abraham",
        userAvatar = "https://static1.purebreak.com.br/articles/7/13/00/7/@/63232-abraham-michael-cudlitz-tem-a-cara-de-700x700-1.jpg"
    )
)

val feedList: MutableList<Feed> = mutableListOf(
    Feed(
        userNickname = "Zombie",
        localName = "Rosewood",
        userAvatar = "https://projectzomboid.com/blog/content/uploads/2022/10/mapspiffoblog-centred-trans.png",
        imageUrl ="https://images5.alphacoders.com/627/627910.jpg",
        description = "Passando dificuldade :)",
        postedAgo = "Há 1 dia"
        ),

    Feed(
        userNickname = "The Walking Dead",
        localName = "Georgia",
        userAvatar = "https://ovicio.com.br/wp-content/uploads/2019/05/20190513-the-walking-dead-comics-rick-grimes-1170814.jpeg",
        imageUrl ="https://img.r7.com/images/the-walking-dead-18072020173303685?dimensions=660x360&&&resize=660x360&crop=781x426+0+306",
        description = "Passando dificuldade :)",
        postedAgo = "Há 1 dia"
    ),

    Feed(
        userNickname = "Kotlin",
        localName = "USA",
        userAvatar = "https://miro.medium.com/v2/resize:fit:1400/1*MCU8J5-roudxIIYt1U1J1A.jpeg",
        imageUrl ="https://bs-uploads.toptal.io/blackfish-uploads/components/blog_post_page/content/cover_image_file/cover_image/1272409/regular_1708x683_RENDER_1__2_-6e93fa7621abfe9e81524024b92dfe47.png",
        description = "Passando dificuldade :)",
        postedAgo = "Há 1 dia"
    ),

    Feed(
        userNickname = "Zombie",
        localName = "Rosewood",
        userAvatar = "https://photos.fife.usercontent.google.com/pw/AIL4fc-p2QKsXdL6c-pJnVk2Imu1Wi2kT_sLvaDruAev2QRWVVu9wLKKctosnw=w758-h845-s-no?authuser=0",
        imageUrl ="https://images5.alphacoders.com/627/627910.jpg",
        description = "Passando dificuldade :)",
        postedAgo = "Há 1 dia"
    ),

    Feed(
        userNickname = "Zombie",
        localName = "Rosewood",
        userAvatar = "https://projectzomboid.com/blog/content/uploads/2022/10/mapspiffoblog-centred-trans.png",
        imageUrl ="https://images5.alphacoders.com/627/627910.jpg",
        description = "Passando dificuldade :)",
        postedAgo = "Há 1 dia"
    )
)