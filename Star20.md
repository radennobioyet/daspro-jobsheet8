# JOBSHEET 8
# Percobaan 1


Pertanyaan
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian? 
2. Jika perulangan for, kondisi i<=N diubah menjadi i > N, apa akibatnya? Mengapa bisa demikian?
3. Jika perulangan for, kondisi step i++ menjadi i-- apa akibatnya? Mengapa bisa demikian?



Jawaban
1. Bintang yang dicetak menjadi lebih satu dari jumlah yang diinginkan (total = N + 1 bintang). Karena perhitungan dimulai dari nol, batas <= N menyebabkan satu kali iterasi tambahan.
2. Tidak akan ada bintang yang dicetak sama sekali. karena Kondisi awal sudah tidak terpenuhi, sehingga loop tidak berjalan sama sekali.
3. Terjadi perulangan tak berujung (infinite loop), program akan macet. Karena arah perubahan i berlawanan dengan logika kondisi, loop jadi tidak berakhir.