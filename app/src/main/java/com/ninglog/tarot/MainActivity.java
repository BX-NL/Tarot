package com.ninglog.tarot;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<TarotCard> tarot_card_list; // 用于存储所有塔罗牌的列表
    private ImageView tarot_card_ImageView; // 显示塔罗牌图片
    private TextView tarot_card_description_TextView; // 显示塔罗牌解读
    private View overlayView; // 半透明磨砂层
    private boolean isCardBack = false; // 判断是否显示卡牌背面
    private TarotCard drawnCard; // 当前抽取的塔罗牌

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TarotCardManager tarotCardManager = new TarotCardManager(); // 初始化塔罗牌管理器
        tarot_card_list = tarotCardManager.getTarotCardList(); // 获取塔罗牌列表

        // 获取布局文件中的控件
        Button drawCardButton = findViewById(R.id.drawCardButton);
        tarot_card_ImageView = findViewById(R.id.cardImageView);
        tarot_card_description_TextView = findViewById(R.id.cardDescriptionTextView);
        overlayView = findViewById(R.id.overlayView);

        // 为按钮设置点击监听器
        drawCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawnCard = drawRandomCard(); // 随机抽取一张塔罗牌

                // 显示塔罗牌图片，并根据正逆位设置旋转角度
                tarot_card_ImageView.setImageResource(drawnCard.getImageResourceId());
                tarot_card_ImageView.setRotation(drawnCard.isReversed() ? 180 : 0);
                tarot_card_ImageView.setVisibility(View.VISIBLE);
                tarot_card_description_TextView.setVisibility(View.GONE);
                overlayView.setVisibility(View.GONE);
                isCardBack = false; // 初始为显示正面

//                // 为图片设置点击监听器
//                tarot_card_ImageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if (!isCardBack) {
//                            // 翻转到背面
//                            Animation flipToBack = AnimationUtils.loadAnimation(MainActivity.this, R.anim.flip_to_back);
//                            tarot_card_ImageView.startAnimation(flipToBack);
//
//                            flipToBack.setAnimationListener(new Animation.AnimationListener() {
//                                @Override
//                                public void onAnimationStart(Animation animation) {}
//
//                                @Override
//                                public void onAnimationEnd(Animation animation) {
//                                    // 显示空白背面
//                                    tarot_card_ImageView.setImageResource(android.R.color.transparent);
//                                    isCardBack = true; // 现在为显示背面
//                                }
//
//                                @Override
//                                public void onAnimationRepeat(Animation animation) {}
//                            });
//                        } else {
//                            // 翻转回正面
//                            Animation flipToFront = AnimationUtils.loadAnimation(MainActivity.this, R.anim.flip_to_front);
//                            tarot_card_ImageView.startAnimation(flipToFront);
//
//                            flipToFront.setAnimationListener(new Animation.AnimationListener() {
//                                @Override
//                                public void onAnimationStart(Animation animation) {}
//
//                                @Override
//                                public void onAnimationEnd(Animation animation) {
//                                    // 显示塔罗牌正面
//                                    tarot_card_ImageView.setImageResource(drawnCard.getImageResourceId());
//
//                                    // 显示塔罗牌解读
//                                    String description = drawnCard.isReversed()
//                                            ? drawnCard.getReversedDescription()
//                                            : drawnCard.getUprightDescription();
//                                    tarot_card_description_TextView.setText(description);
//                                    overlayView.setVisibility(View.VISIBLE);
//                                    tarot_card_description_TextView.setVisibility(View.VISIBLE);
//                                    isCardBack = false; // 现在为显示正面
//                                }
//
//                                @Override
//                                public void onAnimationRepeat(Animation animation) {}
//                            });
//                        }
//                    }
//                });
            }
        });
    }

    // 使用洗牌算法随机抽取一张塔罗牌
    private TarotCard drawRandomCard() {
        shuffleDeck(); // 洗牌
        return tarot_card_list.get(0); // 返回第一张牌
    }

    // Fisher-Yates 洗牌算法
    private void shuffleDeck() {
        Random random = new Random();
        for (int i = tarot_card_list.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Collections.swap(tarot_card_list, i, j); // 交换位置
        }
        for (TarotCard card : tarot_card_list) {
            card.setReversed(random.nextBoolean()); // 随机设置正逆位
        }
    }
}
