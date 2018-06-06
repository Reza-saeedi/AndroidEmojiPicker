package org.messenger.emojiPicker.components.emoji;

import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class StaticEmojiPageModel implements EmojiPageModel {

  public enum EmojiType{Text,Url}
  @AttrRes
  private final int      iconAttr;
  @NonNull
  private final String[] emoji;
  @Nullable
  private final String   sprite;

  @Nullable
  private  EmojiType  type=EmojiType.Text;

  public StaticEmojiPageModel(@AttrRes int iconAttr, @NonNull String[] emoji, @Nullable String sprite, @Nullable EmojiType type) {
    this.iconAttr  = iconAttr;
    this.emoji     = emoji;
    this.sprite    = sprite;
    this.type=type;
  }

  public StaticEmojiPageModel(@AttrRes int iconAttr, @NonNull String[] emoji, @Nullable String sprite) {
    this.iconAttr  = iconAttr;
    this.emoji     = emoji;
    this.sprite    = sprite;
    this.type=EmojiType.Text;
  }

  @Override
  public EmojiType getType() {
    return type;
  }

  public int getIconAttr() {
    return iconAttr;
  }

  @NonNull
  public String[] getEmoji() {
    return emoji;
  }

  @Override public boolean hasSpriteMap() {
    return sprite != null;
  }

  @Override @Nullable
  public String getSprite() {
    return sprite;
  }

  @Override public boolean isDynamic() {
    return false;
  }
}
