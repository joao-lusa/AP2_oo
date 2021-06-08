package com.example.saude;

import android.os.Parcel;
import android.os.Parcelable;

public class DataClass implements Parcelable {
    double idade;
    double sexo;
    double peso;
    double atividade;
    double fumo;
    double pressao;
    double familia;
    double colesterol;
    double resultado;

    public String calcular(){
        resultado = idade + sexo + peso + atividade + fumo + pressao + familia + colesterol;

        return Double.toString(resultado);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(this.idade);
        dest.writeDouble(this.sexo);
        dest.writeDouble(this.peso);
        dest.writeDouble(this.atividade);
        dest.writeDouble(this.fumo);
        dest.writeDouble(this.pressao);
        dest.writeDouble(this.familia);
        dest.writeDouble(this.colesterol);
        dest.writeDouble(this.resultado);
    }

    public void readFromParcel(Parcel source) {
        this.idade = source.readDouble();
        this.sexo = source.readDouble();
        this.peso = source.readDouble();
        this.atividade = source.readDouble();
        this.fumo = source.readDouble();
        this.pressao = source.readDouble();
        this.familia = source.readDouble();
        this.colesterol = source.readDouble();
        this.resultado = source.readDouble();
    }

    public DataClass() {
    }

    protected DataClass(Parcel in) {
        this.idade = in.readDouble();
        this.sexo = in.readDouble();
        this.peso = in.readDouble();
        this.atividade = in.readDouble();
        this.fumo = in.readDouble();
        this.pressao = in.readDouble();
        this.familia = in.readDouble();
        this.colesterol = in.readDouble();
        this.resultado = in.readDouble();
    }

    public static final Parcelable.Creator<DataClass> CREATOR = new Parcelable.Creator<DataClass>() {
        @Override
        public DataClass createFromParcel(Parcel source) {
            return new DataClass(source);
        }

        @Override
        public DataClass[] newArray(int size) {
            return new DataClass[size];
        }
    };
}
