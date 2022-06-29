import numpy as np
from flask import Flask, request, jsonify, render_template
import pickle

# Create flask app
flask_app = Flask(__name__)
model = pickle.load(open("CropReccomend.pkl", "rb"))

@flask_app.route("/")
def Home():
    return render_template("index.html")

@flask_app.route("/predict", methods = ["POST"])
def predict():
    float_features = [float(x) for x in request.form.values()]
    features = [np.array(float_features)]
    prediction = model.predict(features)
    if(prediction == 20):
        #print("Recommended crop is rice")
        return render_template("index.html", prediction_text = "The recommended crop is rice")
    elif(prediction == 11):
        #print("Recommended crop is maize")
        return render_template("index.html", prediction_text = "The recommended crop is maize")
    elif(prediction == 3):
        #print("Recommended crop is chickpea")
        return render_template("index.html", prediction_text = "The recommended crop is chickpea")
    elif(prediction == 9):
        #print("Recommended crop is kidneybeans")
        return render_template("index.html", prediction_text = "The recommended crop is kidneybeans")
    elif(prediction == 18):
        #print("Recommended crop is pigeonpeas")
        return render_template("index.html", prediction_text = "The recommended crop is pigeonpeas")
    elif(prediction == 13):
        #print("Recommended crop is mothbeans")
        return render_template("index.html", prediction_text = "The recommended crop is mothbeans")
    elif(prediction == 14):
        #print("Recommended crop is mungbean")
        return render_template("index.html", prediction_text = "The recommended crop is mungbean")
    elif(prediction == 2):
        #print("Recommended crop is blackgram")
        return render_template("index.html", prediction_text = "The recommended crop is blackgram")
    elif(prediction == 10):
        #print("Recommended crop is lentil")
        return render_template("index.html", prediction_text = "The recommended crop is lentil")
    elif(prediction == 19):
        #print("Recommended crop is pomegranate")
        return render_template("index.html", prediction_text = "The recommended crop is pomegranate")
    elif(prediction == 1):
        #print("Recommended crop is banana")
        return render_template("index.html", prediction_text = "The recommended crop is banana")
    elif(prediction == 12):
        #print("Recommended crop is mango")
        return render_template("index.html", prediction_text = "The recommended crop is mango")
    elif(prediction == 7):
        #print("Recommended crop is grapes")
        return render_template("index.html", prediction_text = "The recommended crop is grapes")
    elif(prediction == 21):
        #print("Recommended crop is watermelon")
        return render_template("index.html", prediction_text = "The recommended crop is watermelon")
    elif(prediction == 15):
        #print("Recommended crop is muskmelon")
        return render_template("index.html", prediction_text = "The recommended crop is muskmelon")
    elif(prediction == 0):
        #print("Recommended crop is apple")
        return render_template("index.html", prediction_text = "The recommended crop is apple")
    elif(prediction == 16):
        #print("Recommended crop is orange")
        return render_template("index.html", prediction_text = "The recommended crop is orange")
    elif(prediction == 17):
        #print("Recommended crop is papaya")
        return render_template("index.html", prediction_text = "The recommended crop is papaya")
    elif(prediction == 4):
        #print("Recommended crop is coconut")
        return render_template("index.html", prediction_text = "The recommended crop is coconut")
    elif(prediction == 6):
        #print("Recommended crop is cotton")
        return render_template("index.html", prediction_text = "The recommended crop is cotton")
    elif(prediction == 8):
        #print("Recommended crop is jute")
        return render_template("index.html", prediction_text = "The recommended crop is jute")
    elif(prediction == 5):
        #print("Recommended crop is coffee")
        return render_template("index.html", prediction_text = "The recommended crop is coffee")
    #return render_template("index.html", prediction_text = "The recommended crop is {}".format(prediction))

if __name__ == "__main__":
    flask_app.run(debug=True)