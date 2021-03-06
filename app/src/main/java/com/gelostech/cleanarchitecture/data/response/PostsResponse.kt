package com.gelostech.cleanarchitecture.data.response

import com.gelostech.cleanarchitecture.data.Status
import com.gelostech.cleanarchitecture.data.models.Post

class PostsResponse  {
    var status: Status
    var posts: List<Post>? = null
    var error: Throwable? = null

    private constructor(status: Status, posts: List<Post>?, error: Throwable?) {
        this.status = status
        this.posts = posts
        this.error = error
    }

    companion object {

        fun loading(): PostsResponse {
            return PostsResponse(Status.LOADING, null, null)
        }

        fun success(posts: List<Post>): PostsResponse {
            return PostsResponse(Status.SUCCESS, posts, null)
        }

        fun error(error: Throwable): PostsResponse {
            return PostsResponse(Status.ERROR, null, error)
        }

    }

}