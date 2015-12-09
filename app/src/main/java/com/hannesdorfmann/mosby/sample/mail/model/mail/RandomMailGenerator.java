/*
 * Copyright 2015 Hannes Dorfmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hannesdorfmann.mosby.sample.mail.model.mail;

import com.hannesdorfmann.mosby.sample.mail.model.contact.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * Just a simple class that generates Mails
 *
 * @author Hannes Dorfmann
 */
public class RandomMailGenerator implements MailGenerator {

    public Random random = new Random();

    private String[] hiTed = new String[]{
            "Hi Teddy! ", "Yo Teddy! ", "Hi 美女! ", "Hey 兄弟!", "哥们! ", "Dear Teddy! ",
            "任务已经安排! ", "项目已经启动!", "开会啦? ", "Hey, 进展怎样啦?",
            "Hello Teddy. "
    };

    private String[] subjects = new String[]{
            "开题", "Bug跟踪", "需求会议", "代码Review", "培训",
            "Bug修复", "项目上线", "今晚开 Party", "紧急上线", "采购设备"
    };

    private String[] barneyQuotes = new String[]{
            "由于此人出现的时间不固定，\n"
                    + "他家门口就常出现垃圾",
            "Okay, 本报就曾报道过王先生家的遭遇，不过直到现在仍未解决。\n"
                    + "今年3月他在家门口安装了一个监控器。通过监控录像他发现了这名“作案人”。随后记者跟随王先生走进了他的家，根据监控软件调出了12月5日晚上的一段监控录像。时间定格在12月5日19时37分，此时从楼下突然出现了一个人影\n"
                    + "方似乎知道门上安装了摄像头，所以一直有意躲避。\n"
                    + "王先生一家人的生活因此受到了严重影响",
            "此人的行为已经触犯了\n"
                    + "但被张某拒绝，两人因此发生争执!”",
            "两名法警将李某带入法庭。65岁的李某中等个头，身材微胖，头发花白，戴着一副眼镜\n"
                    + "平区某村被害人张某家中\n",
                   "张某答应赔偿300元医药费，但一直拖着不给。李某说，案发当天，他来到张某家中，两人喝酒聊天!” \n"
                    + "肢解起来很快，也了解如何下刀不会流血过多\n"
                    + "示：“我没有杀人故意，是因为醉酒。”说到这里\n"
                    + "我二姑打电话说一直联系不上\n"
    };

    private String[] marshallQuotes = new String[]{
            "的详细信息?宁波欧欧电商致力于为传统品牌企业提供电子商务一站式解决方案,通过互联网传递品牌价值。为客户提供电子商务规划、品牌营销、店铺设计、平台搭建",
            "公司办公面积2400平方,是一家为传统的品牌企业提供一站式电子商务外包服务的企业。宁波欧欧电商致力于为传统品牌",
            "里我们在两个不同的屏幕间定义了相同的transitionName 。当你启动一个新的Activity，它的切换将会自动的动画起来。对于进入和退出的元素，你可以自由编排。!",
            "式响应用户的触摸事件。你可以通过使用或者继承Theme.Material主题!",
            "效果中的一个标志是通过延伸一个圆形的面板来展示新的内容。增强了作为所有转换起点的触摸点"
    };

    private String[] lilyQuotes = new String[]{
            "频播放平台;是国内首家专注于提供免费、高清网络视频服务的大型视频网站。爱奇艺影视内容丰富多元,涵盖电影、电视剧、综艺、纪录片、动画片",
            "制团队邀请郭德纲、朱丹等众多大腕联合打造了以德服人, 青春那些",
            "供当下最新、最火各类好看的电影大片在线观看服务,爱奇",
            "启动“爱奇艺”品牌并推出全新标志。爱奇艺创始人龚宇博士担任CEO。自成立伊始.",
            "如要下载 QIYI 的免费 App 爱奇艺视频HD - 奔跑吧兄弟第三季全网独播,请立即获取 iTunes。 已经有 iTunes 了? 现在点击「我有 iTunes」",
            "阅读评论、比较用户评分、查看屏幕快照并进一步了解“爱奇艺PPS影音-海量电影电视剧综艺视频播放器”。下载“爱奇艺PPS影音-海量电影电视剧综艺视频播放器”,并在您的",
            "阅读评论、比较用户评分、查看屏幕。下载“爱奇艺PPS影音-海量电影电视剧综艺视频播放器”,并在您的",
            "Okay but hurry, or I'm gonna start doing number eleven on my own. Pilates bitch!",
            "Please help me off the couch so I can storm out!",
            "阅读评论、比较用户评分、查看屏幕快照并进一步了解“爱奇艺PPS影音-海量电影电视剧综艺视频播放器”。下载“爱奇艺PPS影音-海量电影电视剧综艺视频播放器”,并在您的",
    };

    private String[] robinQuotes = new String[]{
            "线损的组成及影响线损的主要因素",
            "线损组成包括固定损失、可变损失和其它损失。",
            "固定损失一般不随负荷变动而变化。包括：变压器的铁损(即空载损耗)，电能表电压线圈的损失，电容器和电缆的介质损失等。",
            "可变损失是随负荷电流的变动而变化的，它与电流的平方成正比，包括：变压器的铜损，输配电线路的线损，接户线的线损，电能表电流线圈的损耗等。",
            "其它损失是供用电过程中的“跑、冒、滴、漏”造成的损失。包括：计量装置本身的综合误差，或计量装置故障;营业抄收工作中的漏抄",
            "错抄",
            "错算及倍率错误等;用户违章用电和窃电;变配电所的所用电;带电设备绝缘不良引起的泄漏损失;供售电量抄表结算时间(周期)不对应;",
            "统计线损与理论线损统计计算的口径不一致，以及理论计算的误差等。",
            "降损的主要措施"
    };

    private String[] tedQuotes = new String[]{
            "农电负荷季节性强、波动大的特点，主变一般应选择2台。可以考虑一大一小的“母子变”，其中小容量主变应能满足低谷时最小负荷。",
            "②准确预测农村用电负荷，合理确定10kV配电变压器的布点、型号和容量。",
            "配电变压器的选择应考虑以下几条原则：",
            "a.配电变压器一般应安装在其供电范围的负荷中心，并满足线路末端电压质量的要求，以减少线路损失。",
            "b.一台配电变压器最好能带几种性质的负荷(大型冲击性负荷除外)，以便利用各种负荷在时间上的差异，使配电变压器容量得到充分利用。对于排灌站和机井应设置专用变压器，不要接入其它负荷，以便在非排灌季节停用;变压器的经济负载率为60%～70%。",
            "c.配变的安装位置必须安全、可靠，同时应考虑高低压进出线和维护检修方便等因素。",
            "d.国家电力公司规定，新建与改造必须使用新型S9系列配电变压器，淘汰64、73系列高耗能变压器。",
            "③精心勘测设计，合理选择高低压线路路径和导线的规格："
    };

    @Override
    public List<Mail> generateMails() {

        int id = 0;
        int mailSize = 50;
        List<Mail> mails = new ArrayList<>(mailSize);

        long day = 24 * 60 * 60 * 1000;
        long timestamp = System.currentTimeMillis();

        for (int i = 0; i < mailSize; i++, timestamp -= day) {

            String quotes[] = barneyQuotes;
            Person sender = Person.BARNEY;

            switch (i % 5) {

                case 1:
                    sender = Person.LILY;
                    quotes = lilyQuotes;
                    break;

                case 3:
                    sender = Person.MARSHALL;
                    quotes = marshallQuotes;
                    break;

                case 4:
                    sender = Person.ROBIN;
                    quotes = robinQuotes;
                    break;

                default: // 0 and 2 is barney
                    break;
            }

            String label;
            if (i < 40) {
                label = Label.INBOX;
            } else if (i < 45) {
                label = Label.SPAM;
            } else {
                label = Label.TRASH;
            }

            mails.add(new Mail().id(id++)
                    .date(new Date(timestamp))
                    .label(label)
                    .read((i % 6) != random.nextInt(6))
                    .receiver(Person.TED)
                    .sender(sender)
                    .subject(randomString(subjects))
                    .text(generateMsg(quotes)));
        }

    /*
    // SENT
    Person[] receiver = { barney, marshall, lily, robin };
    for (int i = 0; i < 10; i++, timestamp -= day) {
      mails.add(new Mail().id(id++)
          .date(new Date(timestamp))
          .label(Label.SENT)
          .read(true)
          .receiver(receiver[randomIndex(receiver)])
          .sender(ted)
          .subject("RE: " + randomString(subjects))
          .text(generateMsg(tedQuotes)));
    }
    */
        return mails;
    }

    private int randomIndex(Object[] array) {
        return random.nextInt(array.length);
    }

    private String randomString(String[] arr) {
        return arr[randomIndex(arr)];
    }

    private String generateMsg(String[] quotes) {

        StringBuilder message = new StringBuilder(hiTed[randomIndex(hiTed)]);

        HashSet<Integer> used = new HashSet<>();
        for (int i = 0; i < 3; i++) {

            message.append("\n");

            int index = 0;
            do {
                index = randomIndex(quotes);
            } while (used.contains(index));

            message.append(quotes[index]);
            used.add(index);
        }

        return message.toString();
    }

    @Override
    public Mail generateResponseMail(String senderMail) {

        String quotes[] = null;
        Person sender = null;

        if (senderMail.equals(Person.BARNEY.getEmail())) {
            sender = Person.BARNEY;
            quotes = barneyQuotes;
        } else if (senderMail.equals(Person.LILY.getEmail())) {
            quotes = lilyQuotes;
            sender = Person.LILY;
        } else if (senderMail.equals(Person.MARSHALL.getEmail())) {
            quotes = marshallQuotes;
            sender = Person.MARSHALL;
        } else if (senderMail.equals(Person.ROBIN.getEmail())) {
            quotes = robinQuotes;
            sender = Person.ROBIN;
        } else {
            return null;
        }

        return new Mail().id(0)
                .date(new Date())
                .read(false)
                .receiver(Person.TED)
                .sender(sender)
                .subject(randomString(subjects))
                .text(generateMsg(quotes));
    }
}
