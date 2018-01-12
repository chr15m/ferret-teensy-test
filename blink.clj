;;; blink.clj
(require '[ferret.arduino :as gpio])

(gpio/pin-mode 11 :output)

(forever
 (gpio/digital-write 11 1)
 (sleep 500)
 (gpio/digital-write 11 0)
 (sleep 500))
