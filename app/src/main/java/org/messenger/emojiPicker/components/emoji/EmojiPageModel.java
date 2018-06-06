package org.messenger.emojiPicker.components.emoji;

public interface EmojiPageModel {
  StaticEmojiPageModel.EmojiType getType();
  int getIconAttr();
  String[] getEmoji();
  boolean hasSpriteMap();
  String getSprite();
  boolean isDynamic();
}
