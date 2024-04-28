package com.example.newsapplication;

import java.util.List;

public interface OnItemClickListener {
    void onItemClick(News news, List<News> relatedNews);
}
