package com.ninglog.tarot;

import java.util.ArrayList;
import java.util.List;

public class TarotCardManager {
    // 返回塔罗牌列表
    public List<TarotCard> getTarotCardList() {
        List<TarotCard> tarotCardList = new ArrayList<>();

        // 初始化塔罗牌，每张牌包含名称、序号、图片资源ID、正位解读和逆位解读
        tarotCardList.add(new TarotCard("愚者", 0, R.drawable.major_arcana_0, "Upright description for Fool", "Reversed description for Fool"));
        tarotCardList.add(new TarotCard("魔术师", 1, R.drawable.major_arcana_1, "Upright description for Magician", "Reversed description for Magician"));
        tarotCardList.add(new TarotCard("女祭司", 2, R.drawable.major_arcana_2, "Upright description for High Priestess", "Reversed description for High Priestess"));
        tarotCardList.add(new TarotCard("女皇", 3, R.drawable.major_arcana_3, "Upright description for Empress", "Reversed description for Empress"));
        tarotCardList.add(new TarotCard("皇帝", 4, R.drawable.major_arcana_4, "Upright description for Emperor", "Reversed description for Emperor"));
        tarotCardList.add(new TarotCard("教皇", 5, R.drawable.major_arcana_5, "Upright description for Hierophant", "Reversed description for Hierophant"));
        tarotCardList.add(new TarotCard("恋人", 6, R.drawable.major_arcana_6, "Upright description for Lovers", "Reversed description for Lovers"));
        tarotCardList.add(new TarotCard("战车", 7, R.drawable.major_arcana_7, "Upright description for Chariot", "Reversed description for Chariot"));
        tarotCardList.add(new TarotCard("力量", 8, R.drawable.major_arcana_8, "Upright description for Strength", "Reversed description for Strength"));
        tarotCardList.add(new TarotCard("隐者", 9, R.drawable.major_arcana_9, "Upright description for Hermit", "Reversed description for Hermit"));
        tarotCardList.add(new TarotCard("命运之轮", 10, R.drawable.major_arcana_10, "Upright description for Wheel of Fortune", "Reversed description for Wheel of Fortune"));
        tarotCardList.add(new TarotCard("正义", 11, R.drawable.major_arcana_11, "Upright description for Justice", "Reversed description for Justice"));
        tarotCardList.add(new TarotCard("倒吊者", 12, R.drawable.major_arcana_12, "Upright description for Hanged Man", "Reversed description for Hanged Man"));
        tarotCardList.add(new TarotCard("死神", 13, R.drawable.major_arcana_13, "Upright description for Death", "Reversed description for Death"));
        tarotCardList.add(new TarotCard("节制", 14, R.drawable.major_arcana_14, "Upright description for Temperance", "Reversed description for Temperance"));
        tarotCardList.add(new TarotCard("恶魔", 15, R.drawable.major_arcana_15, "Upright description for Devil", "Reversed description for Devil"));
        tarotCardList.add(new TarotCard("高塔", 16, R.drawable.major_arcana_16, "Upright description for Tower", "Reversed description for Tower"));
        tarotCardList.add(new TarotCard("星星", 17, R.drawable.major_arcana_17, "Upright description for Star", "Reversed description for Star"));
        tarotCardList.add(new TarotCard("月亮", 18, R.drawable.major_arcana_18, "Upright description for Moon", "Reversed description for Moon"));
        tarotCardList.add(new TarotCard("太阳", 19, R.drawable.major_arcana_19, "Upright description for Sun", "Reversed description for Sun"));
        tarotCardList.add(new TarotCard("审判", 20, R.drawable.major_arcana_20, "Upright description for Judgement", "Reversed description for Judgement"));
        tarotCardList.add(new TarotCard("世界", 21, R.drawable.major_arcana_21, "Upright description for World", "Reversed description for World"));

        return tarotCardList; // 返回初始化的塔罗牌列表
    }
}
