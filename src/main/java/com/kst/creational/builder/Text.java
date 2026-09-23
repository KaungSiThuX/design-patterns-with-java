package com.kst.creational.builder;

public class Text
{
    String label;
    String color;
    String font;
    int size;

    @Override
    public String toString()
    {
        return "TextBuilder{" +
                "label='" + label + '\'' +
                ", color='" + color + '\'' +
                ", font='" + font + '\'' +
                ", size=" + size +
                '}';
    }

    public Text(Builder builder)
    {
        super();
        this.label = builder.label;
        this.color = builder.color;
        this.font = builder.font;
        this.size = builder.size;
    }

    public static class Builder
    {
        String label;
        String color;
        String font;
        int size;

        public Builder()
        {
        }

        Builder label(String label)
        {
            this.label = label;
            return this;
        }

        Builder color(String color)
        {
            this.color = color;
            return this;
        }

        Builder font(String font)
        {
            this.font = font;
            return this;
        }

        Builder size(int size)
        {
            this.size = size;
            return this;
        }

        Text build()
        {
            return new Text(this);
        }
    }
}
